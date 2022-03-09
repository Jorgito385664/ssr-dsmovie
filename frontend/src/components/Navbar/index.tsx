import { ReactComponent as GithubIcon } from 'assets/img/github.svg';
import './styles.css';

function Navbar() {

    return (
        <header>
            <nav className="container">
                <div className="ssrDsmovie-nav-content">
                    <h1>SSR-DSMovie</h1>
                    <a href="https://github.com/Jorgito385664">
                        <div className="ssrDsmovie-contact-container">
                            <GithubIcon />
                            <p className="ssrDsmovie-contact-link">/Jorgito385664</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    );

}

export default Navbar;