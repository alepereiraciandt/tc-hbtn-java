import java.util.*;

public class Blog {
    private List<Post> posts;

    public Blog() {
        this.posts = new ArrayList<>();
    }

    public void adicionarPostagem(Post post) {
        this.posts.add(post);
    }

    public Set<String> obterTodosAutores() {
        ArrayList<String> sortedAuthor = new ArrayList<>();

        for (Post author : this.posts) {
            sortedAuthor.add(author.getAutor());
        }

        Collections.sort(sortedAuthor);

        Set<String> allAuth = new TreeSet<>(sortedAuthor);

        return allAuth;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> categories = new TreeMap<>();
        List<String> sortedCategories = new ArrayList<>();

        for (Post category : this.posts) {
            sortedCategories.add(category.getCategoria());
        }


        for (String categorie : sortedCategories) {
            int countCur = Collections.frequency(sortedCategories, categorie);
            categories.put(categorie, countCur);
        }

        return categories;
    }
}
