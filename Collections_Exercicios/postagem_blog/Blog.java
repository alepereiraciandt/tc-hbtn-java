import java.util.*;

public class Blog {
    private List<Post> posts;

    public Blog() {
        this.posts = new ArrayList<>();
    }

    public void adicionarPostagem(Post post) {
        if (this.posts.contains(post)) {
            throw new IllegalArgumentException("Postagem jah existente");
        } else {
            this.posts.add(post);
        }
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> allAutor = new TreeSet<>();

        for (Post a : this.posts) {
            if (!allAutor.contains(a.getAutor())) {
                allAutor.add(a.getAutor());
            }
        }

        return allAutor;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> categories = new TreeMap<>();
        for (Post post : this.posts) {
            if (categories.containsKey(post.getCategoria())) {
                categories.put(post.getCategoria(), categories.get(post.getCategoria()) + 1);
            } else {
                categories.put(post.getCategoria(), 1);
            }
        }
        return categories;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> autorSet = new TreeSet<>();
        for (Post posts : this.posts) {
            if (posts.getAutor().equals(autor)) {
                autorSet.add(posts);
            }
        }
        return autorSet;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> post = new TreeSet<>();
        for (Post postie : this.posts) {
            if (postie.getCategoria().equals(categoria)) {
                post.add(postie);
            }
        }
        return post;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> postsByCategorie = new TreeMap<>();
        Set<Post> postSet = new TreeSet<>();
        List<Categorias> categorias = new ArrayList<>();

        for (Post post : this.posts) {
            if (!categorias.contains(post.getCategoria())) {
                categorias.add(post.getCategoria());
            }
        }

        Collections.sort(categorias);

        for (Categorias categoria : categorias) {
            for (Post post : this.posts) {
                if (post.getCategoria().equals(categoria)) {
                    if (!postsByCategorie.containsKey(categoria)) {
                        postSet = new TreeSet<Post>();
                    }
                    postSet.add(post);
                    postsByCategorie.put(categoria, postSet);
                }
            }
        }

        return postsByCategorie;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> postsByAutor = new TreeMap<>();
        Set<Post> postSet = new TreeSet<>();
        List<Autor> autorList = new ArrayList<>();

        autorList.addAll(obterTodosAutores());

        Collections.sort(autorList);

        for (Autor autor : autorList) {
            for (Post post : this.posts) {
                if (post.getAutor().equals(autor)) {
                    if (!postsByAutor.containsKey(autor)) {
                        postSet = new TreeSet<>();
                    }
                    postSet.add(post);
                    postsByAutor.put(autor, postSet);
                }
            }
        }
        return postsByAutor;
    }
}
