from flask import Flask
app = Flask(__name__)

@app.route('/')
def hello_world():
    return 'Hello, Enter the thought of the day'

@app.route('/health')
def health():
    return 'Server is up and running'
